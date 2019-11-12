module spring {
	exports demo to spring.beans;

	requires spring.beans;
	requires spring.context;
	requires spring.core;
}