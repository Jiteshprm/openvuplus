#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "serialinput"
SECTION = "serialinput"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=68b329da9893e34099c7d8ad5cb9c940"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "f8d30e00979702d79c2b9c2709b4b35c947c1eed"
SRC_URI = "git://github.com/Jiteshprm/serial_input.git;protocol=https;branch=samsung_ir_vusolo2"

S = "${WORKDIR}/git"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""
