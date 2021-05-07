# Copyright 2019-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Add packages for AI/ML build"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

ML_PKGS = " \
    armnn \
    tensorflow-lite \
    onnxruntime \
    ml-security \
    pytorch \
    torchvision \
    deepview-rt \
"
ML_PKGS_remove_mx8mm = "deepview-rt"
ML_PKGS_remove_mx8mnlite = "deepview-rt"

ML_PKGS_append_mx8mm = "eiq-apps"
ML_PKGS_append_mx8mp = "eiq-apps"

RDEPENDS_${PN} = " \
    ${ML_PKGS} \
"
