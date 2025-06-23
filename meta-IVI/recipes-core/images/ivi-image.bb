
#require ${LAYERDIR}/../meta-raspberrypi/recipes-core/images/rpi-test-images.bb
require recipes-core/images/rpi-test-image.bb
inherit audio
IMAGE_INSTALL:append=" helloworld openssh nan rpiplay"
IMAGE_FEATURES:append =" debug-tweaks"
