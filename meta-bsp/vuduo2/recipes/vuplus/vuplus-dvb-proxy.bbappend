SRCDATE = "20151201"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "c70865c665de865f0df6e1ddfb5edb25"
SRC_URI[sha256sum] = "c5efec2872ecd9fdc754078cf63cc4a6768d84fd503d60628449745dd5d6bf3a"
