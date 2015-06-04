#!/usr/bin/env bash

yum -y update

# Fix a virtualbox driver issue after updating
yum install -y kernel-devel-$(uname -r) kernel-headers-$(uname -r) dkms
/etc/init.d/vboxadd setup

yum install -y vim man byobu
yum groupinstall -y 'Development Tools'


# NodeJS
curl -sL https://rpm.nodesource.com/setup | bash -
yum install -y nodejs
npm install -g react-tools bower browserify


# Installing RabbitMQ
wget --continue http://dl.fedoraproject.org/pub/epel/6/x86_64/epel-release-6-8.noarch.rpm
yum install -y epel-release-6*.rpm
wget --continue http://www.rabbitmq.com/releases/rabbitmq-server/v3.2.2/rabbitmq-server-3.2.2-1.noarch.rpm
rpm --import http://www.rabbitmq.com/rabbitmq-signing-key-public.asc
yum install -y rabbitmq-server-3.2.2-1.noarch.rpm

# Enable the management plugin
rabbitmq-plugins enable rabbitmq_management

# Make it start on startup
chkconfig rabbitmq-server on
/sbin/service rabbitmq-server start
