SRCDATE = "20151117"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "71002408a4014bf597a474b1594fc732"
SRC_URI[sha256sum] = "4b4765c359342d596814716cded72542242828a6fbbfb6e5136ffcb30f4d132d"
