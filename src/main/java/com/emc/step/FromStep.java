package com.emc.step;

import com.emc.EmailAddress;

public interface FromStep {
    ToStep from(EmailAddress from);
}
