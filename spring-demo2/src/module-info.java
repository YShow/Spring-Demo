module spring {
	exports demo to spring.beans;

	opens demo to spring.core;

	requires spring.beans;
	requires spring.context;
	requires spring.core;
}