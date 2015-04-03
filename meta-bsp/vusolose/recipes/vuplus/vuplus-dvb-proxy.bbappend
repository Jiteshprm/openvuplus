SRCDATE = "20150403"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}

SRC_URI[md5sum] = "12ba22204bb59dd7ae5832b46305e930"
SRC_URI[sha256sum] = "06c8292e25b0f0ea6979f9e0698e5e54d22a630d9fdc0569d2e92e2b09893a64"
