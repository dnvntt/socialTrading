#!/usr/bin/env bash

yum -y update

yum install -y vim man byobu
yum groupinstall -y 'Development Tools'


# Nodejs
curl -sL https://rpm.nodesource.com/setup | bash -
yum install -y nodejs
npm install -g react-tools


# RabbitMQ
wget http://dl.fedoraproject.org/pub/epel/6/x86_64/epel-release-6-8.noarch.rpm
rpm epel-release-6*.rpm
wget http://www.rabbitmq.com/releases/rabbitmq-server/v3.2.2/rabbitmq-server-3.2.2-1.noarch.rpm
rpm --import http://www.rabbitmq.com/rabbitmq-signing-key-public.asc
yum install rabbitmq-server-3.2.2-1.noarch.rpm
