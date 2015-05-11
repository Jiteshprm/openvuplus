SRCDATE = "20150511"
SRCDATE_PR = "r1"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "917506a187fa2619926cb1f844ce049b"
SRC_URI[sha256sum] = "9581750e48cdebcf9e42c140e05015f17a510f5a765539bbee8c080e9ad0a6fd"
