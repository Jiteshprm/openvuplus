SUMMARY = "lightweight DLNA/UPnP-AV server targeted at embedded systems"
HOMEPAGE = "http://sourceforge.net/projects/minidlna/"
SECTION = "network"
LICENSE = "GPL-2.0|BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=b1a795ac1a06805cf8fd74920bc46b5c"
DEPENDS = "ffmpeg flac libav jpeg sqlite3 libexif libogg libid3tag libvorbis"
# because it depends on libav which has commercial flag
LICENSE_FLAGS = "commercial"
SRCREV = "v1_1_4"
PR .= "-vuplus0"

SRC_URI = "git://git.code.sf.net/p/minidlna/git;branch=master;module=git \
		file://default_sqlite_caches.diff \
		file://minidlna.conf \
"

S = "${WORKDIR}/git"

inherit autotools gettext

PACKAGES =+ "${PN}-utils"

CONFFILES_${PN} = "${sysconfdir}/minidlna.conf"

do_install_append() {
	install -d ${D}${sysconfdir}
	install -m 644 minidlna.conf ${D}${sysconfdir}

	install -d ${D}/usr/bin
	mv ${D}/usr/sbin/minidlnad ${D}/usr/bin/minidlna
	rm -rf {D}/usr/sbin
}

SRC_URI[md5sum] = "d966256baf2f9b068b9de871ab5dade5"
SRC_URI[sha256sum] = "170560fbe042c2bbcba78c5f15b54f4fac321ff770490b23b55789be463f2851"
