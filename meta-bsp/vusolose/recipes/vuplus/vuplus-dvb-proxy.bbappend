SRCDATE = "20150623"
SRCDATE_PR = "r0"

do_install_append(){
  ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
}

SRC_URI[md5sum] = "ef806019a6136f8511db1816e7e5c483"
SRC_URI[sha256sum] = "cf8477c7144094917996736721aa5f61b3278b0d39c193b9a1ad4fa45f9db1c8"
