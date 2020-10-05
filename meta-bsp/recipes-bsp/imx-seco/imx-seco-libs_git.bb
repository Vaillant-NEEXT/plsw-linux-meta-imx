# Copyright 2019-20 NXP

SUMMARY = "NXP i.MX SECO library"
DESCRIPTION = "NXP IMX SECO library"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://EULA.txt;md5=228c72f2a91452b8a03c4cab30f30ef9"

DEPENDS = "zlib"

SRCBRANCH = "master"
SECO_LIB_SRC ?= "git://github.com/NXP/imx-seco-libs.git;protocol=https"
SRC_URI = "${SECO_LIB_SRC};branch=${SRCBRANCH} \
        file://0001-Makefile-Fix-LIBDIR-for-multilib.patch \
"
SRCREV = "365f9cb0bf0a1c9435dc402e71cd8776b5a75c0f"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
	oe_runmake DESTDIR=${D} install
	chown -R root:root "${D}"
}

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8m = "(^$)"
