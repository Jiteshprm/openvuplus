SRCDATE = "20151201"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "fe596aae9af4f33460a1ad326b249c52"
SRC_URI[sha256sum] = "5b2925f8dddafc7e5d14fe879383361cc91e003adae33205bf6b7e916e01cc05"
