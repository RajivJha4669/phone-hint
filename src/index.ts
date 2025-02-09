import { registerPlugin } from '@capacitor/core';

export interface PhoneHintPlugin {
  getPhoneNumber(): Promise<{ phoneNumber: string }>;
}

const PhoneNumber = registerPlugin<PhoneHintPlugin>('PhoneHint');

export default PhoneNumber;
