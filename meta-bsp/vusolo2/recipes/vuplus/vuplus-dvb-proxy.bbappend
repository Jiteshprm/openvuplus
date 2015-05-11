SRCDATE = "20150511"
SRCDATE_PR = "r1"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "253a0bd3a5aa8d1cf9c69baf7803d223"
SRC_URI[sha256sum] = "949d712893df3fd09285d5a4ac5a4703695873761ec2a76caf3cfb035c856ee9"
