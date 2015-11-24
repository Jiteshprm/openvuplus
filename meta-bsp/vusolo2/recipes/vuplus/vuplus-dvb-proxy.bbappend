SRCDATE = "20151124"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "ba0fac59d364b8dbfcc2bf87d792ef3b"
SRC_URI[sha256sum] = "a35c3a826b0c34c5ca21097e78888cbe5354bb70bfda727c5889ba6bd62e0738"
