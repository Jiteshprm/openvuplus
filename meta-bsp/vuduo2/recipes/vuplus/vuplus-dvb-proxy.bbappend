SRCDATE = "20150623"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "08d5922591f7ea6032d08887de0f9e7d"
SRC_URI[sha256sum] = "c06c268838f0211d2d8f6608c850c8d0ccc61c7acf02b35c58e317bcc088ab28"
