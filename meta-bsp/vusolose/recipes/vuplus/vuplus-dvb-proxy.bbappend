SRCDATE = "20150511"
SRCDATE_PR = "r1"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}

SRC_URI[md5sum] = "bbee942e1107655d043f3d230eb52919"
SRC_URI[sha256sum] = "1b474422fb092cae3ead609cdfe236dcb450c83c0a447d88ca85bd6e65204697"
