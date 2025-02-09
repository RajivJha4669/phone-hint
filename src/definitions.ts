export interface PhoneHintPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
