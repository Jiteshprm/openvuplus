DESCIPTION = "dinaserver"
MAINTAINER = "vuplus team"
LICENSE = "CLOSED"

PV = "1.0"
PR = "r0"

SRC_URI = "http://archive.vuplus.com/download/utils/vuplus-dlnaserver-${PV}.tar.gz"

do_install() {
	install -d ${D}/usr/lib/enigma2/python/Plugins/Extensions/DLNAServer
	install -m 0755 ${WORKDIR}/dlnaserver ${D}/usr/lib/enigma2/python/Plugins/Extensions/DLNAServer/dlnaserver
}

do_install_arm() {
	install -d ${D}/usr/lib/enigma2/python/Plugins/Extensions/DLNAServer
	install -m 0755 ${WORKDIR}/dlnaserver_arm ${D}/usr/lib/enigma2/python/Plugins/Extensions/DLNAServer/dlnaserver
}

PACKAGES = "${PN}"
FILES_${PN} = "/"

do_populate_sysroot[noexec] = "1"
INSANE_SKIP_${PN} = "already-stripped"

SRC_URI[md5sum] = "c08be968fcf1d707bd940c4bb7fa1fdb"
SRC_URI[sha256sum] = "9b5fc064e725749c45e9f7517e63a8258845220ef6dc5a20093e09f5335493a1"

