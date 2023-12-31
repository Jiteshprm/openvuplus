DESCRIPTION = "Linux kernel for vuplus"
SECTION = "kernel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

KV = "3.3.8"

PR = "r2"
SRCREV = ""

MODULE = "linux-3.3.8"

SRC_URI += "http://archive.vuplus.com/download/kernel/stblinux-3.3.6-2.0.tar.bz2 \
        file://brcm_3.3.patch;patch=1;pnum=1 \
        file://fix_cpu_proc.patch;patch=1;pnum=1 \
        file://brcm_mtd_mac.patch;patch=1;pnum=1 \
        file://dvb_core_5.5.patch;patch=1;pnum=1 \
        file://dvb_backport.patch;patch=1;pnum=1 \
	file://bmips-no-array-bounds.patch;patch=1;pnum=1 \
        file://${MACHINE}_defconfig \
	file://rt5372_kernel_3.3.8.patch \
	"

S = "${WORKDIR}/linux"

inherit kernel

export OS = "Linux"
KERNEL_IMAGETYPE = "vmlinux"
KERNEL_OUTPUT = "vmlinux"
KERNEL_OBJECT_SUFFIX = "ko"
KERNEL_IMAGEDEST = "tmp"

FILES_kernel-image = "/${KERNEL_IMAGEDEST}/vmlinux.gz /${KERNEL_IMAGEDEST}/autoexec.bat"

do_configure_prepend() {
        oe_machinstall -m 0644 ${WORKDIR}/${MACHINE}_defconfig ${S}/.config
        oe_runmake oldconfig
}

kernel_do_install_append() {
        install -d ${D}/${KERNEL_IMAGEDEST}
        install -m 0755 ${KERNEL_OUTPUT} ${D}/${KERNEL_IMAGEDEST}
        gzip ${D}/${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}
}

pkg_postinst_kernel-image () {
        if [ -d /proc/stb ] ; then
                flash_erase /dev/mtd2 0 0
                nandwrite -p /dev/mtd2 /${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}.gz
        fi
        rm -f /${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}.gz
        true
}

SRC_URI[md5sum] = "bfd424a21d3daeb3a100bf8e7443d302"
SRC_URI[sha256sum] = "f8a482de06251761d792ff7ea7fcb73eca4139e5cb80c3b38e39d1c4ef3a35c9"


