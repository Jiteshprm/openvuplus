SRCDATE = "20151124"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}

SRC_URI[md5sum] = "405ee2d88ae4285ca2e10dbccfd0e131"
SRC_URI[sha256sum] = "fc9e93f369d109f12cd71eb5a6e70c99f3bcaa0f110a8603e346ffcb7427c8fb"
