DESCRIPTION = "Vuplus: W-LAN Task for the Vuplus Distribution"
SECTION = "vuplus/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PR = "r16"

inherit task

DEPENDS_${PN} = "enigma2-plugins"
RDEPENDS_${PN} = "\
	${@base_contains("VUPLUS_FEATURES", "vuwlan", "enigma2-plugin-systemplugins-wirelesslansetup", "enigma2-plugin-systemplugins-wirelesslan", d)} \
	wireless-tools \
	wpa-supplicant \
"

WIFI_FIRMWARES = "\
	rt73-firmware \
	zd1211-firmware \
	firmware-htc9271 \
	firmware-rt2561 \
	firmware-rtl8721u \
	firmware-rt3070 \
"

KERNEL_WIFI_MODULES = " \
	kernel-module-ath9k-htc \
	kernel-module-carl9170 \
	kernel-module-prism2-usb \
	kernel-module-rt73usb \
	kernel-module-rt2500usb \
	kernel-module-rtl8187 \
	kernel-module-r8712u \
	kernel-module-w35und \
	kernel-module-zd1211rw \
	kernel-module-llc \
	kernel-module-stp \
	kernel-module-bridge \
	kernel-module-hostap \
	kernel-module-rt2800usb \
"

KERNEL_WIFI_MODULES += "${@base_version_less_or_equal('VUPLUS_KERNEL_VERSION', '3.1.1', 'kernel-module-r8192u-usb', '', d)}"

LEGACY_MODULES = " \
	rt3070 \
	r8192cu \
"

RDEPENDS_${PN}_append = "\
	${WIFI_FIRMWARES} \
	${KERNEL_WIFI_MODULES} \
	${LEGACY_MODULES} \
	rt2870sta \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"

