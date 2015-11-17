SRCDATE = "20151117"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}


SRC_URI[md5sum] = "aa9c0a874d66e3a310cfc50de477628b"
SRC_URI[sha256sum] = "faa5cdf7fc57576062372e7b20a2481e262ec319313f37ca241db5bbe1921b68"
