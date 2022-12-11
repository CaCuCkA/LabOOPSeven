
# Flower Store Lab Seven

## Description

In this lab we discussed how to work with `Spring boot`

## Task

- [x] Discuss layers that web applications usually has. What is API Layer, Service Layer, Data Access Layer?
- [x] What is SpringBoot?
- [x] Check <a src="https://start.spring.io/">SpringBoot Initializr</a>
- [x] Initialize simple web
- [x] Add `@RestController` to a `DemoApplication.java` and implement methods with `@GetMapping` to return a list of objects.
- [x] Migrate `Flower` to this project and implement an endpoint that will return `List.of(Flower)`.
- [x] Refactor `FlowerController`: move to separate package and add `@RequestMapping`.
- [x] Implement `Order` that will implement client order.
- [x] Implement `Item` that will represent the basic element of `Order`.
- [x] Implement different payment strategies with an interface `Payment` and several implementations of it 
- `CreditCardPaymentStrategy`, `PayPalPaymentStrategy`. Use Strategy pattern.
- [x] Implement several Delivery strategies: `PostDeliveryStrategy`, `DHLDeliveryStrategy`.
- [x] Cover delivery and payment packages with tests and endpoints for them.
- [x] Set up GitHub Actions for this project that would run your tests.
- [x] Send a link to your GitHub here.