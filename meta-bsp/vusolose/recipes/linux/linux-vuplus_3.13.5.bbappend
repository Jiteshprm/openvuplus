FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp4"

SRC_URI += " \
        file://brcm_s3_wol.patch;patch=1;pnum=1 \
        file://linux_mtd_bbt_maxblock.patch;patch=1;pnum=1 \
        "


