SRCDATE = "20150318"
SRCDATE_PR = "r1"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}

SRC_URI[md5sum] = "f756cda2e124d870aaa573b8f3f1b077"
SRC_URI[sha256sum] = "4e1f6650959ff140ae321cb02f4d823ec69851ace0513cb810849d8ca93276dd"
