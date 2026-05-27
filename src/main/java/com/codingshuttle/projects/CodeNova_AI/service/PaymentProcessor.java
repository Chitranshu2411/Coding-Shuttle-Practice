package com.codingshuttle.projects.CodeNova_AI.service;

import com.codingshuttle.projects.CodeNova_AI.dto.subscription.CheckoutRequest;
import com.codingshuttle.projects.CodeNova_AI.dto.subscription.CheckoutResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.subscription.portalResponse;
import com.stripe.model.StripeObject;

import java.io.IOException;
import java.util.Map;


public interface PaymentProcessor {

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request);

    portalResponse openCustomerPortal();

    void handleWebhookEvent(String type, StripeObject stripeObject, Map<String, String> metadata) throws IOException;
}