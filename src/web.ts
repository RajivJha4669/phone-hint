import { WebPlugin } from '@capacitor/core';

import type { PhoneHintPlugin } from './definitions';

export class PhoneHintWeb extends WebPlugin implements PhoneHintPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
