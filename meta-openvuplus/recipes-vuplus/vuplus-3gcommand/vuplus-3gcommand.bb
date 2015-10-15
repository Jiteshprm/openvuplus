DESCIPTION = "3gcommand"
MAINTAINER = "vuplus team"
LICENSE = "CLOSED"

PV = "1.0"
PR = "r0"

SRC_URI = "http://archive.vuplus.com/download/utils/vuplus-3gcommand-${PV}.tar.gz"

do_install() {
	install -d ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/3GModemManager
	install -m 0755 ${WORKDIR}/3gcommand ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/3GModemManager/3gcommand
}

do_install_arm() {
	install -d ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/3GModemManager
	install -m 0755 ${WORKDIR}/3gcommand_arm ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/3GModemManager/3gcommand
}

PACKAGES = "${PN}"
FILES_${PN} = "/"

do_populate_sysroot[noexec] = "1"
INSANE_SKIP_${PN} = "already-stripped"

SRC_URI[md5sum] = "a586fa3901204a0344ea28fe6ec20ee1"
SRC_URI[sha256sum] = "59669751d0b95d1da693b22719fa80dd971deb2a0e551d88258f1e634a1acedd"

