DESCRIPTION = "opera-hbbtv"
PRIORITY = "required"
LICENSE = "CLOSED"

DEPENDS = "mpfr gmp gstreamer"
RDEPENDS = "sysfsutils"

SRC_DATE = "20150622_0"

PR = "r2_${SRC_DATE}"
SRC_URI = ""

INHIBIT_PACKAGE_STRIP = "1"
PRIVATE_LIBS_${PN} = "libopera_hbbtv.so \
libdsmcc.so \
libdirect-1.4.so.6 \
libdirectfb-1.4.so.6 \
libfusion-1.4.so.6 \
libdirectfbwm_default.so \
libdirectfb_linux_input.so \
libdirectfb_devmem.so \
libdirectfb_dummy.so \
libdirectfb_fbdev.so \
libidirectfbfont_dgiff.so \
libidirectfbvideoprovider_v4l.so \
libidirectfbvideoprovider_gif.so \
libidirectfbimageprovider_dfiff.so \
libidirectfbimageprovider_gif.so \
libidirectfbimageprovider_jpeg.so \
libicoreresourcemanager_test.so \
libdirectfb_vuplus.so"

S = "${WORKDIR}/opera-hbbtv"

SRC_FILE = "opera-hbbtv_${SRC_DATE}.tar.gz"
do_fetch() {
	if [ ! -e ${DL_DIR}/${SRC_FILE} -a -e /etc/vuplus_browser.pwd ]; then
sshpass -f /etc/vuplus_browser.pwd sftp -o StrictHostKeyChecking=no guestuser@code.vuplus.com << +
get ${SRC_FILE}
bye
+
	fi
	cp -av ${DL_DIR}/${SRC_FILE} ${WORKDIR}/
}

do_unpack() {
	tar xvfz ${SRC_FILE}
}

do_compile() {
}

do_install() {
	install -d ${D}/usr/local/hbb-browser
	mv ${S}/opera/* ${D}/usr/local/hbb-browser/
	install -d ${D}/usr/lib
	mv ${S}/dfb/usr/lib/* ${D}/usr/lib/
}

do_install_append() {
	GST_REQUIRED_VERSION=$(pkg-config --list-all | grep gstreamer-[0-9].* | awk -F "-| " '{print $2}')
	GST_VERSION=$(pkg-config --modversion "gstreamer-$GST_REQUIRED_VERSION >= $GST_REQUIRED_VERSION")
	mv ${D}/usr/local/hbb-browser/root/jsplugins/ooif-gst-$GST_VERSION.so ${D}/usr/local/hbb-browser/root/jsplugins/ooif.so
	rm -f ${D}/usr/local/hbb-browser/root/jsplugins/ooif-gst*.so
	mv ${D}/usr/local/hbb-browser/root/video/videobackend-gst-$GST_VERSION.so ${D}/usr/local/hbb-browser/root/video/videobackend.so
	rm -f ${D}/usr/local/hbb-browser/root/video/videobackend-gst*.so
}

package_do_shlibs_append() {
	deps = "${PKGDEST}/${PN}.shlibdeps"
	tmp = "/tmp/.${PN}.shlibdeps"
	os.system("sed -e '/vbrowser/d' %s > %s" % (deps, tmp))
	os.system("cp %s %s" % (tmp, deps))
}

do_package_qa() {
}

sysroot_stage_all() {
}

PACKAGES = "${PN}"

FILES_${PN} = "/"

SRC_URI[md5sum] = "3dbefb3fce773077fd3604c4666f0c3e"
SRC_URI[sha256sum] = "909dd2f98d322b46a97d298e0dc0ab54a47538a791be3bf40ef9314df0f0aa44"

