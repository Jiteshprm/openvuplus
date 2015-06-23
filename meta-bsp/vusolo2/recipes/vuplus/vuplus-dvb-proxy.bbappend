SRCDATE = "20150623"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "de62591027238991b0a81232a49ad6a8"
SRC_URI[sha256sum] = "b08f6755204d58be01d737d2d239801c80d525d686e4e6819d0901f3096fdb0b"
