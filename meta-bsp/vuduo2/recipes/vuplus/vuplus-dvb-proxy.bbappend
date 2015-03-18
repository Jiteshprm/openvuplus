SRCDATE = "20150318"
SRCDATE_PR = "r1"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "f7ddc604765282e63daffa0b267b21e5"
SRC_URI[sha256sum] = "53e17f31017fe6bb7fd3d40fbf60b6fc902e3af7a8cf5f1975bf0318dcff88e7"
