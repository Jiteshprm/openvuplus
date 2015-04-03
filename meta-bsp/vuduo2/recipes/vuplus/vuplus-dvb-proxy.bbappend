SRCDATE = "20150403"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "28a510daaede53705ab43de3dee84bce"
SRC_URI[sha256sum] = "11ae33abada4ae03a9fe9615003dc44a00725d8c56ba246c02cff644435652c6"
