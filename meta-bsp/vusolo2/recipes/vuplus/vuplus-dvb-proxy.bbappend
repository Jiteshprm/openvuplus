SRCDATE = "20150403"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "970ee7324f62f00bad8495ae311131bc"
SRC_URI[sha256sum] = "264442fad610ad103c65b42549b95b7c039d4acca1b27502d30308510fdde649"
