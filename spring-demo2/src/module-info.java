module spring {
	exports demo to spring.beans,spring.context;

	opens demo to spring.core;

	requires spring.beans;
	requires spring.context;
	requires spring.core;
	requires java.annotation;
}