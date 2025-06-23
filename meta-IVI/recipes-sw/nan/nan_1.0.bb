# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING.DOC
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "GPL-3.0-only & Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
                    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f"

SRC_URI = "https://www.nano-editor.org/dist/v8/nano-8.5.tar.xz"
SRC_URI[md5sum] = "163a06d1320b66c928361320facb47cf"
SRC_URI[sha1sum] = "ae0828489ba70bb7bc450796dadaa82902f1c26c"
SRC_URI[sha256sum] = "000b011d339c141af9646d43288f54325ff5c6e8d39d6e482b787bbc6654c26a"
SRC_URI[sha384sum] = "050ca0dc70757bd544c39695887f1ab8a8f679dfe4549a03eba77347c264354dcf2e9b8b1059c9a9cc25add71caca70d"
SRC_URI[sha512sum] = "d79562b2adbfe165e565b80ab4339e24f4a0ea464a97dfb7dce166df851b514c83e5071d89bee97759c0d6ff7d1fab1da97eaa0e742f3913d5c41a5539a3d8a1"

S = "${WORKDIR}/${BPN}o-8.5"

# NOTE: the following library dependencies are unknown, ignoring: curses
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "ncurses file zlib"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit gettext pkgconfig autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

#FILES_${PN} += "${datadir}/nano/* ${datadir}/nano/extra/*"

do_configure(){
    oe_runconf
}
do_build(){
    oe_runmake
}
do_install(){
    install -d ${D}/${bindir}
    oe_runmake install DESTDIR=${D}
    rm -rf ${D}/${datadir}/nano
}
#FILES_${PN}_rest += "${D}/${datadir}/nano/"
