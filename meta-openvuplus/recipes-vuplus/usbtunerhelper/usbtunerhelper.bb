DESCIPTION = "helper tool to use usb dvb frontends"
MAINTAINER = "PLi team"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${THISDIR}/${PN}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

PV = "1.0+git${SRCPV}"
PR = "r5"
SRC_REV = ""

SRC_URI = " \
	git://code.vuplus.com/git/vtuner.git;protocol=git;tag=${SRC_REV} \
	file://no_usb_device.patch;striplevel=1 \
	file://fix_set_delsys.patch \
	file://get_avail_vtuner.patch \
	file://${PN}.sh \
	"

S = "${WORKDIR}/git"

inherit autotools update-rc.d

INITSCRIPT_NAME = "${PN}"
INITSCRIPT_PARAMS = "defaults"
INITSCRIPT_PARAMS = "start 21 2 3 4 5 . stop 20 0 1 6 ."

do_install_append() {
	install -d ${D}/etc/init.d
	install -m 0755 ${WORKDIR}/${PN}.sh ${D}/etc/init.d/${PN}
}
