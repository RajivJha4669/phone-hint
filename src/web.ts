import { WebPlugin } from '@capacitor/core';

import type { PhoneHintPlugin } from './definitions';

export class PhoneHintWeb extends WebPlugin implements PhoneHintPlugin {
    async getPhoneNumber(): Promise<{ phoneNumber: string }> {
        console.log('Phone number retrieval is not supported on web.');

        return { phoneNumber: '' };
    }
}
