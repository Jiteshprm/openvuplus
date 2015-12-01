SRCDATE = "20151201"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}

SRC_URI[md5sum] = "6f963aa2f38c0c6d4cf5958922f64824"
SRC_URI[sha256sum] = "5a312aac9c9fd6bd6035ae1718a5c8dcea2179456b5c54c600f01c6fe6c4d7f4"
