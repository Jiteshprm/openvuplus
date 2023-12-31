DESCRIPTION = "gstreamer subsink plugin"
SECTION = "multimedia"
PRIORITY = "optional"
DEPENDS = "gstreamer gst-plugins-base"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=7fbc338309ac38fefcd64b04bb903e34"

inherit gitpkgv

PV = "0.10.0+git${SRCPV}"
PKGV = "0.10.0+git${GITPKGV}"
PR = "r2"

SRCREV = "0cb20d602414f25edd8d139627b8e0b2b58aae33"
SRC_URI = "git://git.code.sf.net/p/openpli/gstsubsink"

S = "${WORKDIR}/git"

do_configure_prepend() {
	sed -i 's/AC_INIT.*$/AC_INIT(gst-plugin-subsink, 0.10.0, @pli4)/' ${S}/configure.ac
}
inherit autotools pkgconfig

FILES_${PN} = "${libdir}/gstreamer-0.10/*.so*"
FILES_${PN}-dev += "${libdir}/gstreamer-0.10/*.la"
FILES_${PN}-staticdev += "${libdir}/gstreamer-0.10/*.a"
FILES_${PN}-dbg += "${libdir}/gstreamer-0.10/.debug"
