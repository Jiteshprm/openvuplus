#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Serialinput"
SECTION = "Serialinput"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=68b329da9893e34099c7d8ad5cb9c940"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "8208df00574d7d5a5ff553930e2a08cd3c242919"
SRC_URI = "git://github.com/Jiteshprm/serial_input.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""
