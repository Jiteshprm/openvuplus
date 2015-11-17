SRCDATE = "20151117"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}

SRC_URI[md5sum] = "c19422c7a13f717320eba6c672d868c4"
SRC_URI[sha256sum] = "6291e4f0ed439b571fcf87512c09b347b188016695acd8edc4f30939428d57e0"
