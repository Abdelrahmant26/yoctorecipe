# yoctorecipe
Yocto Task
### Included Layers:
layer                 path                                      priority
==========================================================================
meta                  /home/yocto/poky/meta                     5
meta-poky             /home/yocto/poky/meta-poky                5
meta-yocto-bsp        /home/yocto/poky/meta-yocto-bsp           5
meta-raspberrypi      /home/yocto/poky/meta-raspberrypi         9
meta-audio-distro     /home/yocto/poky/meta-audio-distro        6
meta-IVI              /home/yocto/poky/meta-IVI                 6
meta-oe               /home/yocto/poky/meta-openembedded/meta-oe  5
meta-webserver        /home/yocto/poky/meta-openembedded/meta-webserver  5
meta-qt5              /home/yocto/poky/meta-qt5                 7

every sw is included in its own recipe within meta-IVI:
- wifi
- custom Cpp Hello
- rpiplay
- nano
- WiFi and avahi

appended Pulseaudio & bluetooth as class within meta-IVI

##Distro Features are appended within the local.conf file including:
- systemd
- bluetooth
- opengl
- wayland
- qt5
