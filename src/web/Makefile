all: build

deps:
	npm install
	bower install

dir:
	mkdir -p dist/scripts
	mkdir -p dist/styles
	mkdir -p .tmp

js: dir
	jsx app/js .tmp/js
	browserify .tmp/js/main.js -o dist/scripts/bundle.js

css: dir
	npm-css app/styles/main.css > dist/styles/bundle.css

build: js css
	cp app/index.html dist
	cp -rf app/img dist

clean:
	rm -rf dist
	rm -rf .tmp
