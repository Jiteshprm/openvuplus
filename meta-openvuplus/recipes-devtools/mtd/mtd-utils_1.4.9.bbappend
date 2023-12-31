PR .= "-vuplus2"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SRC_URI += "file://mkfs.ubifs-allow-output-file-creation-on-different-device.patch"

PACKAGES_DYNAMIC = "mtd-utils-*"

ALLOW_EMPTY_${PN} = "1"

python populate_packages_prepend () {
        debug_objs = d.expand('${sbindir}/.debug')
        do_split_packages(d, debug_objs, '^(.*)$', 'mtd-utils-%s-dbg', 'mtd-util-dbg %s', recursive=False, match_path=True, prepend=True)
        objs = d.expand('${sbindir}')
        do_split_packages(d, objs, '^(.*)$', 'mtd-utils-%s', 'mtd-util %s', recursive=False, match_path=True, prepend=True)
}
