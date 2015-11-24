SRCDATE = "20151124"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "f96f3f39f6598239914d0d8aefce9bb0"
SRC_URI[sha256sum] = "e6612de4f62927036955e33e1446979329330b953fd5c5be96cc0f4c2efca138"
