PR .= "-vuplus11"

SRC_URI += " \
            file://0001-ifupdown-support-post-up-pre-down-hooks.patch \
            file://0002-ifupdown-code-shrink.patch \
            file://0003-ifupdown-remove-interface-from-state_list-if-iface_u.patch \
            file://0004-ifupdown-support-metric-for-static-default-gw.patch \
            file://0005-ifupdown-improve-compatibility-with-Debian.patch \
            file://0006-get_linux_version_code-don-t-fail-on-3.0-foo.patch \
            file://0007-ifplugd-move-read_pid-to-libbb-pidfile.c-and-rename-.patch \
            file://0009-udhcpc-calculate-broadcast-address-if-not-given-by-s.patch \
            file://0010-udhcpc-obtain-hostname-from-OS-by-default.patch \
            file://0011-mount-don-t-pass-option-auto-to-kernel.patch \
            file://0001-work-around-linux-ext2_fs.h-breakage.patch \
            file://0002-Create-and-use-our-own-copy-of-linux-ext2_fs.h.patch \
            file://0003-Drop-include-bb_linux_ext2_fs.h-use-existing-e2fspro.patch \
            file://mount_single_uuid.patch \
            file://change-passwd-default-algorithm.patch \
	    file://inetd \
	    file://inetd.conf \
"
# 0008-ifupdown-dhcp_down-wait-until-udhcpc-has-been-killed.patch is removed. if patched, postdown is not working.(/etc/network/interfaces)

DEPENDS += "mtd-utils"

PACKAGES =+ "${PN}-inetd"
INITSCRIPT_PACKAGES += "${PN}-inetd"
INITSCRIPT_NAME_${PN}-inetd = "inetd.${BPN}"
CONFFILES_${PN}-inetd = "${sysconfdir}/inetd.conf"
FILES_${PN}-inetd = "${sysconfdir}/init.d/inetd.${BPN} ${sysconfdir}/inetd.conf"
RDEPENDS_${PN}-inetd += "${PN}"

RRECOMMENDS_${PN} += "${PN}-inetd"

do_install_append() {
        if grep -q "CONFIG_CRONTAB=y" ${WORKDIR}/defconfig; then
                install -d ${D}${sysconfdir}/cron/crontabs
        fi
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

