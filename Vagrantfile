# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure(2) do |config|
  config.vm.box = "chef/centos-7.0"
#  config.vm.provider "virtualbox" do |v|
#    v.gui = true
#  end

#  config.vm.network "forwarded_port", guest: 15672, host: 15672
  config.vm.network "public_network"
  config.vm.provision :shell, path: "bootstrap.sh"


  # Enable provisioning with a shell script. Additional provisioners such as
  # Puppet, Chef, Ansible, Salt, and Docker are also available. Please see the
  # documentation for more information about their specific syntax and use.
  # config.vm.provision "shell", inline: <<-SHELL
  #   sudo apt-get update
  #   sudo apt-get install -y apache2
  # SHELL
end
