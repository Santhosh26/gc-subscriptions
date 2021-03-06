package com.example.giftcard.command;

import lombok.Value;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Value
public class IssueCommand {

    @TargetAggregateIdentifier String id;
    BigDecimal amount;

}
