all: build

deps:
	npm install
	bower install

dir:
	mkdir -p dist
	mkdir -p .tmp

js: dir
	jsx app/js .tmp/js
	browserify .tmp/js/main.js -o dist/js/bundle.js

build: js
	mkdir -p dist
	cp app/index.html dist
	cp -rf app/img dist
	cp -rf app/styles dist
	cp -rf bower_components dist

clean:
	rm -rf dist
	rm -rf .tmp
