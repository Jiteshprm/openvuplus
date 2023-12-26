DESCRIPTION = "HelloWorld application"
PR = "r0"

LICENSE = "TEST LICENSE"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d41d8cd98f00b204e9800998ecf8427e"

SRC_URI = "file://helloworld.c \
           file://LICENSE \
           file://README.txt"

do_compile() {
        ${CC} ${CFLAGS} ${LDFLAGS} ${WORKDIR}/helloworld.c -o helloworld
}

do_install() {
        install -m 0755 -d ${D}${bindir} ${D}${docdir}/myhelloworld
        install -m 0755 ${S}/helloworld ${D}${bindir}
        install -m 0644 ${WORKDIR}/README.txt ${D}${docdir}/myhelloworld
}