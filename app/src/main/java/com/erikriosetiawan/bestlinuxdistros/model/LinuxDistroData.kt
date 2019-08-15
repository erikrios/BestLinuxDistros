package com.erikriosetiawan.bestlinuxdistros.model

object LinuxDistroData {
    private val data = arrayOf(
        arrayOf(
            "MX Linux",
            "MX Linux is an open-source distro based on antiX and MEPIS. It has been designed to work as elegantly and efficiently on an old configuration as it would on a PC with maxed out specs. MX Linux is a mid-weight distro that is easy to configure and it offers users a reliable performance. It is easy to get up and running with by even beginners to the Linux ecosystem, it can be run directly from a USB, and it has a friendly community ready to help you out whenever you get stuck with any tasks along the way.",
            "https://www.fossmint.com/wp-content/uploads/2019/03/MX-Linux-Distro.jpg"
        ),
        arrayOf(
            "Manjaro",
            "Manjaro is a beautiful Arch Linux-based distro that works as an excellent replacement to MacOS and Windows. The Manjaro community aims to make the awesomeness of Arch Linux available to everyone. The development team works hardware manufacturers to design hardware dedicated to Manjaro in order to offer users an inclusive experience. Manjaro is available for 64-bit architecture in KDE, XFCE, and Gnome editions while the community maintains flavors for 32-bit and ARM architectures. All Manjaro editions share the same base but they offer unique experiences given their desktop environment so be sure to choose one that suits your taste.",
            "https://www.fossmint.com/wp-content/uploads/2019/03/Manjaro-Linux.jpg"
        ),
        arrayOf(
            "Linux Mint",
            "Linux Mint is one of the most liked distros in the Linux community known for its ease of access and intuitive usability. It comes in 3 official flavors, Cinnamon, MATE, and Xfce, which offer a sleek, stable, robust, and innovative User Experience. Linux Mint features a beautiful UI with smooth transitions and a community ready to help you get up and running. It is thought of like the cooler Ubuntu so if you have used Ubuntu before then you are in familiar territory.",
            "https://www.fossmint.com/wp-content/uploads/2019/03/Linux-Mint-Cinnamon-Edition.png"
        ),
        arrayOf(
            "Elementary OS",
            "Elementary is a beautiful Linux distro whose philosophy is to “keep things simple without taking beauty for granted“. It aims to provide users with a fast PC that respects their privacy and is capable of completing any task given to it. With a User Interface inspired by Apple’s macOS, Elementary is a beautiful distro that easily stands as a good replacement of Windows and macOS.",
            "https://www.fossmint.com/wp-content/uploads/2019/03/Elementary-Linux-Distro.jpg"
        ),
        arrayOf(
            "Ubuntu",
            "Ubuntu can easily be the #1 distro on any list such as this one because it is the most popular and arguably the most forked Linux distro in the community. It features a clean UI in all its several flavors and is used for different things including cloud computing, Internet of Things, containers, servers, etc. Ubuntu ships with Gnome as the default desktop environment but it is available with other DEs in the form of flavors including Xubuntu, Lubuntu, Kubuntu, Kylin, Budgie, etc.",
            "https://www.fossmint.com/wp-content/uploads/2018/04/Ubuntu-18.04-Gnome-Desktop.png"
        ),
        arrayOf(
            "Debian",
            "Debian is one of the founding fathers of Linux and it “gave birth” to the most popular Linux distro till date, Ubuntu. It is a powerful distro that ships thousands of precompiled packages bundled into an easy-to-install-on-your-machine format and it requires no extra skills to get up and running with it. Debian is tagged the “Universal Operating System” because of how widely it is used across the world. It is the OS upon which Canonical’s Ubuntu is built and being a robust distro, it can be used for virtually any computing task.",
            "https://www.fossmint.com/wp-content/uploads/2017/12/Debian.png"
        ),
        arrayOf(
            "Solus",
            "Solus is a Linux distro designed to give home users a Personal Computer with a cohesive computing experience. It features a beautiful UI that is intuitive to even children and it is capable of running on older PCs without negatively affecting performance. Solus ships with several preinstalled applications including GNOME MPV for video content, Rhythmbox for audio files and online radio, Files for managing documents, Mozilla Firefox for secure browsing, and Software Center for intuitive application management.",
            "https://www.fossmint.com/wp-content/uploads/2019/03/Solus-Linux-Distro.jpg"
        ),
        arrayOf(
            "Fedora",
            "Fedora is a polished professional Linux distro that aims to give its users complete freedom. It is completely customizable and it comes with a complete set of tools suitable for developers, creators, network administrators, etc. Fedora has setups for different computing tasks. Fedora Workstation is for laptops and desktops, Fedora Server for cloud infrastructure, and Fedora Atomic for Linux-Docker-Kubernetes app stack. Fedora ships with GNOME Desktop Environment by default but you can choose any of its spins if you would rather work with KDE Plasma, XFCE, LXQT, etc.",
            "https://www.fossmint.com/wp-content/uploads/2019/03/Fedora-Linux-Distro.jpg"
        ),
        arrayOf(
            "openSUSE",
            "openSUSE is arguably the #1 choice of Linux distro for developers, system admins, and virtually any other user. It has an active community known for developing their own tools so you can be certain that you wouldn’t lack any tools necessary for your workflow. openSUSE is available in 2 release types: Tumbleweed – a rolling release version which is always updated with the latest improvements, bug fixes, and new features. And Leap – a regular-release version that gets updated periodically. Generally, you should use Tumbleweed if you want in on the latest updates to openSUSE and don’t mind struggling with bugs every now and then, and use Leap if you would rather manually update your system only when you are ready for whatever new changes in the pipeline.",
            "https://www.fossmint.com/wp-content/uploads/2017/12/OpenSUSE.png"
        ),
        arrayOf(
            "Deepin",
            "Deepin is a beautiful Linux distro devoted to providing its users with a consistently beautiful Operating System that is secure, easy to use, and reliable to work with. It was formerly based on Ubuntu until its code was rewritten to be based on Debian. Deepin is my favorite pick in this list because of how seamlessly every aspect of the OS works. Ever since it reached an important milestone with the release of 15.7 when it optimized its ISO image size, RAM usage, extended battery life, etc., Deepin has never been better.",
            "https://www.fossmint.com/wp-content/uploads/2018/08/Deepin-Desktop.png"
        )
    )

    val listData: ArrayList<LinuxDistro>
        get() {
            val list = arrayListOf<LinuxDistro>()
            for (aData in data) {
                val linuxDistro = LinuxDistro()
                linuxDistro.distroName = aData[0]
                linuxDistro.description = aData[1]
                linuxDistro.photos = aData[2]

                list.add(linuxDistro)
            }
            return list
        }
}