SRCDATE = "20150318"
SRCDATE_PR = "r1"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "39d21584623f238df0b4dec24d7a0927"
SRC_URI[sha256sum] = "3c76cfa031608f214083ff6a07ef8e02958cd34fef675b71cfe2efe9b26eda7b"
